APCS-LIBS
=========

1: Add the classes to package a.b to use the library.
2: The classes are IO.java and Text.java
3: To create a package, right-click on src and hover over new, the click package. ONLY CHANGE THE NAME to a.b
Create the classes in that package.
5: To do so, right-click on the package a.b and click on new -> Class. ONLY CHANGE THE NAME to IO
6: Go to IO.java on this site. Click on raw, then copy everything from the text box. Delete everything in the new class you created in eclipse, then paste your clipboard.
Repeat steps 5 and 6, but call the class Text instead of IO
You are done! Here is how you use the library (Each line is a different feature, none are required for another):

    String whatTheyTyped = IO.in();
		IO.out("Hi");
		IO.out(2);
		IO.outnl("Same.");
		IO.prl();
		IO.sleep(50);
		
		Text.printBigText("Hi");
		Text.printBigText("Hi", new java.awt.Font("Tomaha", Font.PLAIN, 35));
		Text.printBigText("Hi", "Gigi");
		Text.printBigText("Hi", "Gigi", 30);

There is a list of availible fonts at http://www.java2s.com/Tutorial/Java/0261__2D-Graphics/Togetallavailablefontsinyoursystem.htm
Create a ticket for help!
