# ProductDemo

This is the Day-2 assignment which is the the extension to the project taught in the live session.

The following methods need to be implemented with the help of streams:

- Write a method that returns all the items(products) in the given place.
- Write a method that returns all the items(products) which are out of warranty year.

I also added id property and a method "getProductById" which makes searching easy and uniquely identifies the product.

Now let's understand the implementation of the methods:

### `getProductById(int id)`<br/>
- This is a function which accepts id(integer) and returns the product whose id matches with the given id. 
- Here i am using streams filter function which runs on each product in the list and checking if the id of the product is matching with the given id or not by using `==`. If it matches it will return that product otherwise it will throw an exception saying product not found.

### `getProductsByPlace(String place)` <br/>
- This is a function which accepts place(String) and returns all the product whose place matches with the given place. 
- Here also i am using filter function and checking if place is matching with the given place or not by using `equalsIgnoreCase`, because i want to make my search case insensitive.
- So, if the codition is satisfied i will add that product into the list and return it. Otherwise if none of the product is in the given place it will return null, which is handled with Exception handling in main method and prints the message saying no product is available/there in the given place. We can customise this message accordingly.

### `getProductsOutOfWarranty(int year)` <br/>
- This is a function which accepts year(integer) and returns all the product that are out of warranty technically less than the given year. 
- Here also i am using filter function and checking if the year given is greater than the product's warranty year, if it is i will return those products.
- Otherwise if none of the product is out of warranty it will return null, which is handled with Exception handling in main method and prints the message saying no product is out of warranty. We can customise this message accordingly.
