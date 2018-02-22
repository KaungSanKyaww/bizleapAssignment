// Package names are written in all lower case to avoid conflict with the names of classes or interfaces.
package com.bizleap.assignment.one;

// Class Name :: should start with uppercase letter and be a noun e.g. String, Color, Button, System, Thread etc.
public class FileReader {

    // Constants name :: should be in uppercase letter. e.g. RED, YELLOW, MAX_PRIORITY etc.
    final double PI = 3.14;

    // Variable Name :: should start with lowercase letter e.g. firstName, orderNumber etc.
    private String myVariable;

    // Method Name :: should start with lowercase letter and be a verb e.g. actionPerformed(), main(), print(), println() etc.
    public void setMyVariable(String someParameter) {
        this.myVariable = someParameter;
    }

}

// Interface Name :: should start with uppercase letter and be an adjective e.g. Runnable, Remote, ActionListener etc.
interface Testable {

}

// Enum Name :: like Class Name
enum Day {
    // should be in uppercase letter
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}


/*
 * Java follows camelcase syntax for naming class, interface, method and variable eg. setSomething(), myVariable
 *
 * Reference :: https://www.javatpoint.com/java-naming-conventions
 */