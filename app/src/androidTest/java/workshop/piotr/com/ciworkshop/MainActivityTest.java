package workshop.piotr.com.ciworkshop;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Piotr Przywieczerski on 10.12.2016.
 */

public class MainActivityTest
{
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void shouldDisplayHelloWorld()
    {
        Espresso.onView(ViewMatchers.withId(R.id.text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}
