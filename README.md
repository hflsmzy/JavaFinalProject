# JavaFinalProject



Java Final Project proposal
Zhenyu Ma(zm2172), Ze Miao(zm2143), Xiangyu Lu(xl4044)

Plan
We plan to design a budget book that allows the user to keep track of how much money they spend. It will have several features.
1. Spending summary
This will tells us our total monthly spending,today’s spending, our average daily spending, how much budget do we have, and the days left for the end of the month, We will create a circular progress bar to visualize our spending.
2. Record a spending
We can record the amount of money we spend, the category, date, and notes.
3. Spending category
This displays the number of spending for each category and allow us to create, read, update and delete our spending data.
4. Monthly spending report
This displays a line chart of our spending trend in this month.
5. Budget setting
This allows the user to set a budge and set up mysql configuration.
6. Data backup
This allows the user to backup the data in the database.
7. Data recovery
This allows the user to recover the database.

Advanced Java Concept
We will use the GUI, JDBC and swing java features to implement this program.












Design

We plan to have the following packages. 
1.Program
The main program
2.Entity
Three classes for category, configuration and record.
3.Dao
Three dao classes for category, configuration and record.
4.Frame
Main panel will use the BorderLayerout where the north is a toolbar and the middle is an empty panel that will be used to display the different functions.
5.Listener
Different listener classes.
6.Model
A category combo box model class and a category table model class.
7.Page
A page class that will be used as our line chart graph
8.Panel
Different panel class that corresponds to different functions. 
9.Service
Category service, configuration service, record service, report service, and spend service.
10.Startup
One Bootstrap class for the program.
11.Util
Different util classes to facilitate our code.
12.Test
A test class used to test our program.





