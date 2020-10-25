package com.soecode.lyf.dto;

import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.enums.AppointStateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 封装预约执行后结果
 */
@Data
@NoArgsConstructor
@ToString
public class AppointExecution {

	// 图书ID
	private long bookId;

	// 秒杀预约结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 预约成功对象
	private Appointment appointment;


	// 预约失败的构造器
	public AppointExecution(long bookId, AppointStateEnum stateEnum) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 预约成功的构造器
	public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.appointment = appointment;
	}

}
