package cn.whxlover.test;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import cn.whxlover.pojo.Video;
import cn.whxlover.service.VideoUserSer;
import cn.whxlover.service.VideoUserSerImp;
public class userTest {
	@Autowired
	private VideoUserSer vus;
	@Test
	public void addHistory(){
		System.out.println("sss");
		//VideoUserSer vu = new VideoUserSerImp();
		Video video = vus.searchVideo("1");
		System.out.println(video.toString());
	}
}
