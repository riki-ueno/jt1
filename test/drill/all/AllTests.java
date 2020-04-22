package drill.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import drill.step01.Variable03Test;
import drill.step02.Array01Test;
import drill.step03.If01Test;
import drill.step04.For06Test;
import drill.step05.String02Test;
import drill.step06.ArrayLoop01Test;
import drill.step07.List03Test;
import drill.step08.Map01Test;
import drill.step09.Method04Test;
import drill.step09.Method07Test;

@RunWith(Suite.class)
@SuiteClasses({
	Variable03Test.class,
	Array01Test.class,
	If01Test.class,
	For06Test.class,
	String02Test.class,
	ArrayLoop01Test.class,
	List03Test.class,
	Map01Test.class,
	Method04Test.class,
	Method07Test.class
})
public class AllTests {

}
