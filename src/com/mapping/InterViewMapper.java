package com.mapping;

import com.model.InterView;

public interface InterViewMapper {
	void addInterView (InterView interView) ;
	InterView findByVid(int vid);
	void updateBtime(InterView interView);
	void updateState(InterView interView);
}
