package com.uni.chap02_inherit.run;

import com.uni.chap02_inherit.model.vo.Airplane;
import com.uni.chap02_inherit.model.vo.Car;
import com.uni.chap02_inherit.model.vo.Ship;
import com.uni.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리",12.5,"sedan",4);
		
		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 5);
		
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		System.out.println(c.toString());
		System.out.println(a);
		System.out.println(s);
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		//다형성 적용하고 howToMove() 찍기
		Vehicle[] v = new Vehicle[3];
		v[0] = new Car("벤틀리",12.5,"sedan",4);
		v[1] = new Airplane("비행기", 0.021, "제트기", 16, 5);
		v[2] = new Ship("낚시배", 3, "어선", 1);
		
		for(Vehicle p : v) {
			p.howToMove();
		}
	}	
}
