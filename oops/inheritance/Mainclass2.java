class WhatsappV1 
{
	public void sendMsg()
	{
		System.out.println("sending txt msg");
	}
}

class WhatsappV2 extends WhatsappV1
{
	public void voiceMsg()
	{
		System.out.println("sending voice msg");
	}
}

class WhatsappV3 extends WhatsappV2
{
	public void videoCall()
	{
		System.out.println("video calling");
	}
}

class Mainclass2
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       WhatsappV1 v1 = new WhatsappV1();
       v1.sendMsg();
       
       System.out.println("-----------------");
       
       WhatsappV2 v2 = new WhatsappV2();
       v2.sendMsg();
       v2.voiceMsg();

       System.out.println("----------------------");
  
       WhatsappV3 v3 = new WhatsappV3();
       v3.sendMsg();
       v3.voiceMsg();
       v3.videoCall();





	   System.out.println("Program ends...");
	}
}






