package org.add;

public class statedetails extends LanguageInfo{
    private void southIndian() {
		System.out.println("southIndian: tamilNadu");
	

}
    private void northIndian() {
		System.out.println("noth Indian: delhi");
	}
    public static void main(String[] args) {
    	LanguageInfo r = new LanguageInfo();
        r.TamilLanguage();
        r.englishLanguage();
        r.hindiLanguage();
        statedetails t= new statedetails();
        t.southIndian();
        t.northIndian();
        
        		
        		
        		
    }
    
			

}
