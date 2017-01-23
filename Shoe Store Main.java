
public class showstoremain {
	showstore show=new showstore();
	//Verify email text box  validation
	
	public void emailTextVerify() throws InterruptedException
	{
		show.openshowstore();
		show.verifyShowSite();
		show.verifyEmailTest();
	}
	//Verify Successful message validation
	public void verifysuccMessage() throws InterruptedException
	{
		show.openshowstore();
		show.verifyShowSite();
		show.verifyEmailTest();
		show.enterEmailAddress();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		showstoremain obj1=new showstoremain();
		//Verify email text box validation
		obj1.emailTextVerify();
		//Verify Successful message validation
		obj1.verifysuccMessage();

	}

}
