package com.wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * HelloWorld
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class HelloWorld {

    @Test
    public void testHelloWorld(){
        assertEquals(1,1);
    }

    // assertThrows(ConstraintViolationException.class, () -> {
    //     WalletItem walletItem = 
    //        new WalletItem(null, null, DATE, null, DESCRIPTION, null);
    //     repository.save(walletItem);
    // });
}