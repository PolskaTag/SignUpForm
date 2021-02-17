# SignUpForm
CIS 3515 Assignment 2 - Created by Philip Lapinski

## What's it about:
Our goal is to make a form for a user to input their credentials. Then after clicking a button, the user should get a nice greeting.
The app also needs to have error messages that guides the user to correct usage. **This is a mock form - no information is saved.**

## The Setup:
1. Start a new Android Studio Project as **Empty Activity**.
2. Name the app *SignUpForm* - use **temple.edu** for project package.
3. Pick a directory you have full access to.
4. Only Phone and Tablet should be checked. API 27 or recent version of Andriod.
5. Rename(refractor) activity to FormActivity.

## The Requirements:
* Create fields for **name, email, password, and passwordconf**.
    * Must have error messages on right and labels on left.
    * Error messages should only appear when user error occurs.
    
* Create a message area
    * used by button to display information.
    
* Create button
    * Validates that *password* and *passwordconf* are the same.
    * Displays error messages next to "bad" fields if user error.
    * Populates message area with information and displays.
