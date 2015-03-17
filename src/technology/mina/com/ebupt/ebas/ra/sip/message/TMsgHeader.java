package com.ebupt.ebas.ra.sip.message;

import java.nio.channels.SelectionKey;

public class TMsgHeader {
	public int sourceDomainId = 77; // 源地址域编号.1个字节
	public int sourceFeId = 33; // 源地址功能实体类型编号.1个字节
	public int sourceInstanceId = 33; // 源地址功能实体实例编号.1个字节
	public int sourceSessionId = 0; // 源地址会话号.4个字节
	
	public int destDomainId = 99; // 目的地址域编号.1个字节
	public int destFeId = 20; // 目的地址功能实体类型编号.1个字节
	public int destInstanceId = 12; // 目的地址功能实体实例编号.1个字节
	public int destSessionId = 0; // 目的地址会话号.4个字节
	
	public short frontId = 0;//content[10,11]
	public short backId = 0;//content[12,13]

	
	public int serviceId = 1; //content[0]
	public int serviceInstanceId = 0; //content[1]
	
	public SelectionKey key = null;
}
