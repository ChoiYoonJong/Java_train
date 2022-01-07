package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

//mvc ���� �� view ��Ű�� : ����ڰ� ���Ե� ȭ���� ����ϴ� �κ�
//���� ����ڰ� ���ԵǴ� ��¹� (print����)�� �ݵ�� view ��Ű�� �ȿ��� �ۼ�!! �׿ܴ� ��!
//�Ӹ��ƴ϶� ����ڰ� Ű����� �Է��ϴ� �κ�(scanner���)�� view ��Ű�� �ȿ��� �ۼ�!! �׿ܴ� ��!
public class MemberView {

	// ȭ���̱� ������ ����ڰ� Ű����� ���� �Է��Ҽ� �ֵ��� Scanner��ü����
	private Scanner sc = new Scanner(System.in);
	// ȭ�鿡�� ����ڰ� ��û ó���� �� ������ controller�� �޼ҵ带 �����Ұű� ������ memberController ��ü ����
	private MemberController mc = new MemberController();
	

	public MemberView() {

	}

	// ���α׷� ����� ���ÿ� ������ ȭ��
	public void mainMenu() {
		// 1_1. �α����� ���� ���̵�� ��й�ȣ�� �Է¹޴´�.  
		System.out.print("���̵� �Է��Ͻÿ� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		String pwd = sc.nextLine();

		// 1_2. ����ڰ� �Է��� ���̵�� ��й�ȣ�� controller�� ������ ó���� �� ������� �޴´�.
		int result = mc.login(id, pwd); // ����ڰ� �Է��� ���̵�� ��й�ȣ controller�� ����

		// 1_2_1. ��� ���� 1�� ��� ��, �α��ο� ������ ���
		if (result == 1) {
			System.out.println("�� �α���!!!");
			while (true) {
				System.out.println("===== �޴� ��� =====");
				System.out.println("1. �� ���� ����");
				System.out.println("2. �� ���� ��ȸ");
				System.out.println("3. Ű �����ϱ�");
				System.out.println("9. �����ϱ�");
				System.out.print("�޴� ���� : ");
				int num = sc.nextInt();

				switch (num) {
				case 1:
					System.out.println(mc.readInfo().information());
					break;
				case 2:
					System.out.println(mc.readAge());
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�޴��� �ٽ� �������ּ���.");
					break;
				}
			}
		}else { // 1_2_2. �ƴ� ��� ��, �α��ο� �����Ѱ�� 
			System.out.println("���̵�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			System.out.println("���α׷��� �����մϴ�. ����");
		}
	}

	public void updateHeight() {
		System.out.print("���� �� Ű �Է� : ");
		double height = sc.nextDouble();

		mc.updateHeight(height);
	}

}

