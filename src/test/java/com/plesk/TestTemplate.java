package com.plesk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTemplate {

    @Test
    void templateTest() {

        Template template = new Template();
        assertEquals("Hello", template.giveBack());
    }
}
