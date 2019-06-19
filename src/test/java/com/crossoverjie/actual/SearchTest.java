package com.crossoverjie.actual;

import com.crossoverjie.actual.Search;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest {

  @Test
  public void testSearch() {
    Assert.assertFalse(Search.search(null));
    Assert.assertFalse(Search.search(" "));
    
    Assert.assertFalse(Search.search("foo"));
    Assert.assertFalse(Search.search("foo.bar"));

    Search.addWord("fooabar");
    Assert.assertTrue(Search.search("foo.bar"));
  }
}
