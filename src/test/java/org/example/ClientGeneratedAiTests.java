package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

<think>
Okay, so I'm trying to fix this Java test class that's causing some build errors. The main issue seems to be related to unclosed character literals or improper string handling. Let me break down what I need to do step by step.

First, I'll look at the error messages to understand where exactly the problems are occurring. Since the user mentioned specific line numbers like 137, I'll focus on those areas. It's likely that there are strings in these lines that aren't properly enclosed with double quotes or have some syntax issues.

I remember that Java uses double quotes for strings and single quotes for characters. So if I see something like `String testValue 'example';`, that's incorrect because it's using single quotes. I need to change those to use double quotes: `String testValue = "example";`.

Next, I'll check for any multi-line strings. If the string spans multiple lines and isn't properly enclosed or has missing escape characters (like `\n` for newlines), that could cause errors. I'll make sure these are correctly formatted.

Another thing to look out for is missing semicolons at the end of statements. Java requires each statement to end with a semicolon, so if any lines don't have them, I'll add them in.

I should also review the entire test class to ensure that all variables are properly initialized and that method calls and assertions use valid strings. For example, in `assertEquals`, both the expected value and actual results should be correctly formatted strings with proper quotes.

If there are nested structures where quotes might interfere, like using double quotes inside a string that's already enclosed in double quotes, I'll need to escape those inner quotes by adding a backslash before them. For instance: `"Hello \"World\""`.

I'll also consider any recent changes I made to the test class that might have introduced these errors. Maybe I added new test cases or modified existing ones without properly closing all strings. It's easy to overlook a missing quote or semicolon when making quick edits, so I'll double-check those areas.

To get precise information about where the issues are occurring, I'll run the build with more detailed error reporting. Maven has options for generating compile-time errors that can point me directly to the problematic lines.

Once I've identified and fixed all these syntax issues, I'll re-run the build to ensure the errors are resolved. If any new errors pop up after fixing the obvious ones, I'll need to dig deeper into other parts of the test class to find and fix those as well.

In summary, my plan is:
1. Review the specific error messages and pinpoint the problematic lines.
2. Correct improper string enclosures by replacing single quotes with double quotes where necessary.
3. Check for missing semicolons and ensure all statements end correctly.
4. Handle multi-line strings properly, using escape characters as needed.
5. Ensure proper escaping of nested quotes to avoid syntax issues.
6. Re-run the build after making these corrections to verify everything works as expected.

By systematically addressing each error and ensuring proper Java syntax, I should be able to fix the build issues and get my test class running smoothly again.
