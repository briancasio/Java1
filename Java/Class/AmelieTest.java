import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AmelieTest {



@Test
public boolean testPrintHelloWorld(String hw) {
    
    if("Hello, World!".equals(hw)){

        return true;

    }
    else{
        return false;
    }

}

}
