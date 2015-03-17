package com.ebupt.ebas.dispatcher.sip.tmsg;

import java.nio.channels.SelectionKey;

import com.ebupt.ebas.ra.sip.message.TMsgHeader;
import com.ebupt.ebas.ra.util.CodeUtil;

public class TMsg {

	public byte[] syncheader = new byte[4]; // 4字节同步头
	public int vrsn = 1; // 内部协议版本号.1个字节.取值为1
	public int reserved = 31; // 保留字段.1个字节.30内部转发,31外部
	public int packetLength = 23; // 消息包总长度.2个字节.最大包长为65535.消息包的长度不包含同步头的长度.
	public int messageType = 2; // 消息类型.1个字节.2为业务类消息，1为管理类消息
	public int messageCode = 3; // 消息编号.1个字节.根据messageType的类型不同而表达的意思不一样。1：begin 3：continue 4：end
	public int isDivided = 1; // 消息分片指示.1个字节，最高位一个bit表示这个消息包是否是该消息的最后一个消息包0[是]1[不是]后7位表示该消息包是该消息的第几包
	
	public int sourceDomainId = 77; // 源地址域编号.1个字节
	public int sourceFeId = 33; // 源地址功能实体类型编号.1个字节
	public int sourceInstanceId = 33; // 源地址功能实体实例编号.1个字节
	public int sourceSessionId = 0; // 源地址会话号.4个字节
	
	public int destDomainId = 99; // 目的地址域编号.1个字节
	public int destFeId = 20; // 目的地址功能实体类型编号.1个字节
	public int destInstanceId = 12; // 目的地址功能实体实例编号.1个字节
	public int destSessionId = 0; // 目的地址会话号.4个字节
	public short frontId = 0;
	public short backId = 0;
	
	public int sequenceNumber = 1; // 消息序列号.1个字节
	public int timeToLive = 4; // 消息包生存时间.1个字节
	public byte[] content = null; // 消息包内容.n个字节，0 <= n <= 65535-23
	
	public SelectionKey key = null;
	
	public TMsg() {
		
	}
	
	public TMsg(SelectionKey key) {
		this.key = key;
	}
	
	
	 public byte[] doFrontPackMsg(int i) throws NumberFormatException {
		 	byte[] contents = new byte[i];
		 	int index = 0;
		 	
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = 0;

		 	
		 	contents[index++] = new Integer(vrsn).byteValue();

		 	contents[index++] = new Integer(reserved).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes2(packetLength), 0, contents, 6, 2);
			index = index + 2;
			
			contents[index++] = new Integer(messageType).byteValue();

			contents[index++] = new Integer(messageCode).byteValue();

			contents[index++] = new Integer(isDivided).byteValue();

			contents[index++] = new Integer(sourceDomainId).byteValue();

			contents[index++] = new Integer(sourceFeId).byteValue();

			contents[index++] = new Integer(sourceInstanceId).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes4(sourceSessionId), 0, contents, 14, 4);
			//System.arraycopy(CodeUtil.encode2Bytes2(frontId), 0, contents, 14, 2);
			//System.arraycopy(CodeUtil.encode2Bytes2(backId), 0, contents, 16, 2);
			
			index = index + 4;

			contents[index++] = new Integer(destDomainId).byteValue();

			contents[index++] = new Integer(destFeId).byteValue();

			contents[index++] = new Integer(destInstanceId).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes4(destSessionId), 0, contents, 21, 4);
			index = index + 4;
			
			contents[index++] = new Integer(sequenceNumber).byteValue();

			contents[index++] = new Integer(timeToLive).byteValue();

			if (content != null) {
				int contentlen = content.length;
				System.arraycopy(content, 0, contents, 27, contentlen);
	
			}
			return contents;
		}
	 
	 public byte[] doBackPackMsg(int i) throws NumberFormatException {
		 	byte[] contents = new byte[i];
		 	int index = 0;
		 	
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = 0;

		 	
		 	contents[index++] = new Integer(vrsn).byteValue();

		 	contents[index++] = new Integer(reserved).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes2(packetLength), 0, contents, 6, 2);
			index = index + 2;
			
			contents[index++] = new Integer(messageType).byteValue();

			contents[index++] = new Integer(messageCode).byteValue();

			contents[index++] = new Integer(isDivided).byteValue();

			contents[index++] = new Integer(sourceDomainId).byteValue();

			contents[index++] = new Integer(sourceFeId).byteValue();

			contents[index++] = new Integer(sourceInstanceId).byteValue();

			//System.arraycopy(CodeUtil.encode2Bytes4(sourceSessionId), 0, contents, 14, 4);
			System.arraycopy(CodeUtil.encode2Bytes2(frontId), 0, contents, 14, 2);
			System.arraycopy(CodeUtil.encode2Bytes2(backId), 0, contents, 16, 2);
			
			index = index + 4;

			contents[index++] = new Integer(destDomainId).byteValue();

			contents[index++] = new Integer(destFeId).byteValue();

			contents[index++] = new Integer(destInstanceId).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes4(destSessionId), 0, contents, 21, 4);
			//System.arraycopy(CodeUtil.encode2Bytes2(frontId), 0, contents, 21, 2);
			//System.arraycopy(CodeUtil.encode2Bytes2(backId), 0, contents, 23, 2);
			index = index + 4;
			
			contents[index++] = new Integer(sequenceNumber).byteValue();

			contents[index++] = new Integer(timeToLive).byteValue();

			if (content != null) {
				int contentlen = content.length;
				System.arraycopy(content, 0, contents, 27, contentlen);
			}
			return contents;
		}
	 
	 public byte[] getMsgContent(byte[] a_packMsg) {
	       vrsn = new Byte(a_packMsg[0]).intValue();

	       reserved = new Byte(a_packMsg[1]).intValue();

	       packetLength = CodeUtil.decode2Int(a_packMsg[2], a_packMsg[3]);

	       messageType = new Byte(a_packMsg[4]).intValue();

	       messageCode = new Byte(a_packMsg[5]).intValue();
	       isDivided = new Byte(a_packMsg[6]).intValue();

	       sourceDomainId = new Byte(a_packMsg[7]).intValue();

	       sourceFeId = new Byte(a_packMsg[8]).intValue();

	       sourceInstanceId = new Byte(a_packMsg[9]).intValue();
	       byte[] tmpSourceSessionId = new byte[4];
	       System.arraycopy(a_packMsg, 10, tmpSourceSessionId, 0, 4);
	       sourceSessionId = CodeUtil.decode4Int(tmpSourceSessionId[0], tmpSourceSessionId[1], tmpSourceSessionId[2], tmpSourceSessionId[3]);

	       destDomainId = new Byte(a_packMsg[14]).intValue();

	       destFeId = new Byte(a_packMsg[15]).intValue();

	       destInstanceId = new Byte(a_packMsg[16]).intValue();

	       byte[] tmpDestSessionId = new byte[4];
	       System.arraycopy(a_packMsg, 17, tmpDestSessionId, 0, 4);
	       destSessionId = CodeUtil.decode4Int(tmpDestSessionId[0], tmpDestSessionId[1], tmpDestSessionId[2], tmpDestSessionId[3]);

	       sequenceNumber = new Byte(a_packMsg[21]).intValue();
	       timeToLive = new Byte(a_packMsg[22]).intValue();

	       content = new byte[a_packMsg.length - 23];
	       System.arraycopy(a_packMsg, 23, content, 0, a_packMsg.length - 23);
	       
//	       byte[] byteFrontId = new byte[2];
//	       System.arraycopy(a_packMsg, 33, byteFrontId, 0, 2);
//	       frontId = CodeUtil.decodeByteArray2short(byteFrontId);
//	       
//	       byte[] bytebacktId = new byte[2];
//	       System.arraycopy(a_packMsg, 35, bytebacktId, 0, 2);
//	       backId = CodeUtil.decodeByteArray2short(bytebacktId);
	       return content;
	   }
	   
	   
	   public byte[] doPackMsg() {
		    byte[] contents = new byte[packetLength + 4];
		 	int index = 0;
		 	
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = -1;
		 	contents[index++] = 0;

		 	
		 	contents[index++] = new Integer(vrsn).byteValue();

		 	contents[index++] = new Integer(reserved).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes2(packetLength), 0, contents, 6, 2);
			index = index + 2;
			
			contents[index++] = new Integer(messageType).byteValue();

			contents[index++] = new Integer(messageCode).byteValue();

			contents[index++] = new Integer(isDivided).byteValue();

			contents[index++] = new Integer(sourceDomainId).byteValue();

			contents[index++] = new Integer(sourceFeId).byteValue();

			contents[index++] = new Integer(sourceInstanceId).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes4(sourceSessionId), 0, contents, 14, 4);
			index = index + 4;

			contents[index++] = new Integer(destDomainId).byteValue();

			contents[index++] = new Integer(destFeId).byteValue();

			contents[index++] = new Integer(destInstanceId).byteValue();

			System.arraycopy(CodeUtil.encode2Bytes4(destSessionId), 0, contents, 21, 4);
			index = index + 4;
			
			contents[index++] = new Integer(sequenceNumber).byteValue();

			contents[index++] = new Integer(timeToLive).byteValue();

			if (content != null) {
				System.arraycopy(content, 0, contents, 27, content.length);
			}
			
			return contents;
	   }
	   
	   public TMsgHeader getTMsgHeader() {
			TMsgHeader tMsgHeader = new TMsgHeader();
			tMsgHeader.sourceDomainId = this.sourceDomainId; 
			tMsgHeader.sourceFeId = this.sourceFeId; 
			tMsgHeader.sourceInstanceId = this.sourceInstanceId; 
			tMsgHeader.sourceSessionId = this.sourceSessionId;
			
			tMsgHeader.destDomainId = this.destDomainId;
			tMsgHeader.destFeId = this.destFeId;
			tMsgHeader.destInstanceId = this.destInstanceId;
			tMsgHeader.destSessionId = this.destSessionId;
			
			tMsgHeader.frontId = this.frontId;
			tMsgHeader.backId = this.backId;
			
			tMsgHeader.serviceId = new Byte(content[0]).intValue();
			tMsgHeader.serviceInstanceId = new Byte(content[1]).intValue();
			
			tMsgHeader.key = key;
			return tMsgHeader;
	   }
}
