package com.uni.chap02_listSort.model.comparator;

import java.util.Comparator;

import com.uni.chap02_listSort.model.vo.Travel;

public class AscTravelNum implements Comparator<Travel> {


	@Override
	public int compare(Travel o1, Travel o2) {
		return -(o1.gettNum() - o2.gettNum());
	}

}
