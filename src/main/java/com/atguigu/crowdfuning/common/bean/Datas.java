package com.atguigu.crowdfuning.common.bean;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * 数据包装类
 * @author 18801
 *
 */
public class Datas {

	private List<Integer> ids;
	
	private List<MemberCert> mcs;
	
	public List<MemberCert> getMcs() {
		return mcs;
	}

	public void setMcs(List<MemberCert> mcs) {
		this.mcs = mcs;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
}
