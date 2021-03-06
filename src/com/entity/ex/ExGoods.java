/**
 * @description 商品的扩展类
 * @date 2016-8-20
 * @author hxg	
 */
package com.entity.ex;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.entity.Goods;

public class ExGoods extends Goods implements Serializable {
	private static final long serialVersionUID = -6074876787179340794L;
	private String exDate; // 格式化日期
	private MultipartFile gPicFile;

	public String getExDate() {
		return exDate;
	}

	public void setExDate(String exDate) {
		this.exDate = exDate;
	}

	public MultipartFile getgPicFile() {
		return gPicFile;
	}

	public void setgPicFile(MultipartFile gPicFile) {
		this.gPicFile = gPicFile;
	}

}
