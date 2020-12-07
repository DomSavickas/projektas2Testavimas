package com.example.projektas2;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
public class InstrumentedTest
{
    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test_When_spinnerIsSetToChars_when_givenStringIsEntered_To_EditTextViewForWriting() {
        final String givenString = "Testas";
        final String expectedResult = "Simboliai: "+ 6;

        onView(withId(R.id.EditTextViewForWriting)).perform(click(), replaceText(givenString), closeSoftKeyboard());
        onView(withId(R.id.ButtonForCalculation)).perform(click());
        onView(withId(R.id.TextViewForResults)).check(matches(withText(expectedResult)));
    }
    @Test
    public void test_When_spinnerIsSetToWords_when_givenStringIsEntered_To_EditTextViewForWriting() {
        final String givenString = "Testas testas testasas";
        final String expectedResult = "Žodžiai: "+ 3;

        onView(withId(R.id.DropdownList)).perform(click());
        onView(withText("Žodžiai")).perform(click());
        onView(withId(R.id.EditTextViewForWriting)).perform(click(), replaceText(givenString), closeSoftKeyboard());
        onView(withId(R.id.ButtonForCalculation)).perform(click());
        onView(withId(R.id.TextViewForResults)).check(matches(withText(expectedResult)));
    }
}