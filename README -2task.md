This project implements the **Flyweight** pattern for displaying markers on a map. Each marker has a unique address, but the style is reused to reduce memory consumption

##---------------------------------------------------------------------------------------------

- ​​**Hospital**
- **Restaurant**
- **Gas Station**

##---------------------------------------------------------------------------------------------

The project demonstrates how the **Flyweight** pattern can be effectively used to optimize work with a large number of objects that share common properties.

##---------------------------------------------------------------------------------------------

During development, several issues arose that I solved

##----------------------------------------------------------------------------------------------

1. | Typos in the code |
In the early stages I encountered a few typos in marker type names, such as `RESTURANT` instead of `RESTAURANT`. This was causing errors when I tried to associate markers with their styles, and I couldn't figure out why the correct icon wasn't working. After fixing these typos the issues went away.

2. | Incorrect use of keys for styles |
When writing the factory for styles I was using incorrect strings for keys in `MarkerType`. This was causing the program to be unable to find the correct style for the marker and was throwing an error. I solved the issue by matching the correct strings from `MarkerType` with the corresponding styles in `StyleRegistry`.

3. | Issues with using null in marker style |
While working I was forgetting to check if the marker style was | null |, which could cause errors during rendering. I added a check to avoid errors when trying to draw markers with missing styles.

##----------------------------------------------------------------------------------------------
