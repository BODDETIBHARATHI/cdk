package com.pack1;

import com.pojo.MyData;

// import com.pojo.MyData;  // b -> We can write the import statement so that we can create reference to the class which we have imported

public class MyClass1 {

    public void useMyData_myclass() {
		// com.pojo.MyData m = new com.pojo.MyData(); // a -> We can write full specified class by writing package before it so that we can use the class
    	//MyData m = new MyData(); // c -> put the mouse curser on the red cross mark which is there on the left side you will get some of the statements like import statement double click on it so that we will get import statement directly
    	MyData m = new MyData();// d -> After entering My press ctrl+space you will get the className below and when you double click on it you will get import statement directly
    
	}
	
}
