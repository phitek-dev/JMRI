package jmri.util.swing;

import jmri.util.JUnitUtil;

import org.junit.Assert;
import org.junit.jupiter.api.*;

/**
 *
 * @author Paul Bender Copyright (C) 2017
 */
public class ComboBoxColorChooserPanelTest {

    protected ComboBoxColorChooserPanel panel = null;

    @Test
    public void testCTor() {
        Assert.assertNotNull("exists",panel);
    }

    @Test
    public void testGetDisplayName(){
        Assert.assertEquals("display name",Bundle.getMessage("ComboBoxColorChooserName"),panel.getDisplayName());
    }

    @BeforeEach
    public void setUp() {
        JUnitUtil.setUp();
        panel = new ComboBoxColorChooserPanel();
    }

    @AfterEach
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(ComboBoxColorChooserPanelTest.class);

}
