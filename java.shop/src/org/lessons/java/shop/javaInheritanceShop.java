package org.lessons.java.shop;

public class javaInheritanceShop {
	
	
	private String Smarphone;
	private String Televisore;
	private String Cuffie;
	
	
	
	public String getSmarphone() {
		return this.Smarphone;
	}
	public void setSmarphone(String SmarphoneInput) {
		this.Smarphone = SmarphoneInput;
	}
	
	public String getTelevisore() {
		return this.Televisore;
	}
	public String setTelevisore(String TelevisoreInput) {
	 return this.Televisore = TelevisoreInput;
	}
	public String getCuffie() {
		return this.Cuffie;
	}
	public String setCuffie(String CuffieInput) {
	 return this.Cuffie = CuffieInput;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "phone -" + this.Smarphone + " ;" + "tv -" + this.Televisore + " ;" + "Cuffie - " + this.Cuffie+ " ;" ;
	}
	
}
