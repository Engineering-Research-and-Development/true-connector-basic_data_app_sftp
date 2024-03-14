package it.eng.idsa.dataapp.domain;

public class SftpPayload {

	private String checkSum;
	private boolean sftp;
	private String host;
	private int port;

	public SftpPayload() {
		super();
	}

	public SftpPayload(String checkSum, boolean sftp, String host, int port) {
		super();
		this.checkSum = checkSum;
		this.sftp = sftp;
		this.host = host;
		this.port = port;
	}

	public SftpPayload(boolean sftp, String host, int port) {
		super();
		this.sftp = sftp;
		this.host = host;
		this.port = port;
	}

	public String getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public boolean isSftp() {
		return sftp;
	}

	public void setSftp(boolean sftp) {
		this.sftp = sftp;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
