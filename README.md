# RecyclerView-Android

The RecyclerView widget is a more advanced and flexible version of ListView.

What is Recycler View?

1. View Group to display large set of data.
2. For each image in large dataset, it displays a View.
3. Efficient way to implement Scrollable list.

Recycler View Concepts :

1. View Holder = This will hold the view and helps in recycling.
2. Adapter = This will adapt our data so that it can be displayed in a list.

![Recycler View](https://developer.android.com/training/material/images/RecyclerView.png)

Using the Recycler View :

1. Add RecyclerView AndroidX library to the Gradle build file
2. Define a model class to use as the data source
3. Add a RecyclerView to your activity to display the items
4. Create a custom row layout XML file to visualize the item
5. Create a RecyclerView.Adapter and ViewHolder to render the item
6. Bind the adapter to the data source to populate the RecyclerView
