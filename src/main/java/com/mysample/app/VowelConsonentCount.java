package com.mysample.app;

public class VowelConsonentCount {
	
	public static void main(String args[]) {
		
		///String s = "the quick brown fox jumps over the lazy dog";
		String s="a i u e o t m n s w";
		CheckVC check = new CheckVC();
		check.checkString(s);
	}

}


class CheckVC{

	public void checkString(String str) {
		// TODO Auto-generated method stub
	    int v=0;
	    int c=0;
	    boolean flag=false;
	    char[] ch = {'a','e','i','o','u'};
	    str = str.replace(" ", "");
	    for(int i=0;i<str.length();i++) {
	    	flag=false;
	    	char mych = str.charAt(i);
	    	for(int j=0;j<ch.length;j++) {
	    		if(mych==ch[j]) {
	    			flag=true;
	    		}
	    	}
	    	
	    	if(flag==true) {
	    		v++;
	    	}else {
	    		c++;
	    	}
	    	
	    	
	    }
	    
		
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
		
	}
	
	
}
