package SeleniumSessions;

public class AmazonTest2 {

	public static void main(String[] args) throws Exception {
		
        CommonUtils CU = new CommonUtils();
        CU.CommonUtils1();
        //CU.launchUrl("http://www.gmail.com");
		
		//CU.getElement(null)


		//CU.sendKeys("username", "Sudha");
		CU.launchUrl("http://www.amazon.com");
		
			String title = CU.getPageTitle();
			
			{
		System.out.println("page title is: " + title);
		
		if(title.contains("Online Shopping")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(CU.getPageUrl());
		CU.closeBrowser();
	}

}
}
