# ProductSpring

The following query methods & predicate keywords are used inorder to obtain the required results:
<br />

query methods:
- `findBy`

predicate keywords:
- `Contains`
- `IgnoreCase`
- `LessThan`
- `Or`

## Explanation
Now the task is to get the products based on different parameters like name, place, id etc.. which are properties of the Product class right?
So, the way we get them in spring is using methods, i.e we need to create methods with some conventions which will give us the results. let's see what are those conventions and how to write them.

methodname = `query method` + `property we want to search on/colum name in DB` + `predicate keyword(optional)` and upon calling the method will give the results.

Let's take an example and try to understand it. Let's say we want to find a product whose id is 7. What we want is clear, let's try to write the method name.

As we know from the above method is a combination of 3 parameters, let's try to get all of them
1) query method: Here, we want to find a product so query method will be `findBy`.
2) property: We want to find a product by id so, property will be id `Id`.
3) predicate: This is optional(this will be used if we want some extra functionality).
4) So, finally method name = `findBy` + `Id` => `findById`
5) Now we can call it `findById(7)` which will give the product whose id is 7.
6) You can find the exact code of how to write in the repo, have a look at it.


Now let's take another example, Let's say we want to find a product whose place is "White Table" and it should be case insensitive like eventhough you give "white table" which is not exactly matching to "White Table" where `w` and `T` are in lowecase, still we need to get the product.

Again, As we know from the above method is a combination of 3 parameters, let's try to get all of them
1) query method: Here also, we want to find a product so query method will be `findBy`.
2) property: This time ,we want to find a product by place so, property will be place `Place`.
3) Till now our method name looks like `findByPlace` and upon calling will give all the products whose place is "White Table" but if you give "white table" it will fail to give the product, so here comes the predicate into picture which provides extra functionality to our method.
4) Basically here we want to ignore the case of the input given, so inorder to do that there is a predicate called `IgnoreCase`. 
5) So predicate: `IgnoreCase`
6) So, finally method name = `findBy` + `Place` + `IgnoreCase` => `findByPlaceIgnoreCase`
7) Now we can call it `findByPlaceIgnoreCase("white table")` which will give the product whose place is "white table".
8) You can find the exact code of how to write in the repo, have a look at it.

In the similar manner i wrote the required methods as shown below:
- `findBy` + `Warranty` + `LessThan` => `findByWarrantyLessThan`
- `findBy` + `Name` + `Contains` + `IgnoreCase` + `Or` + `Type` + `Contains` + `IgnoreCase` + `Or` + `Place` + `Contains` + `IgnoreCase` => findByNameContainsIgnoreCaseOrTypeContainsIgnoreCaseOrPlaceContainsIgnoreCase

That's it for today.
Happy coding 🚀🚀