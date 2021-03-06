package com.empanada.app.webservice.pagination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PageTest {

  @Test
  private void buildObjectWithParameters() {
    int numberOfPage = 0;
    int sizeOfPage = 5;

    Page page = Page.build(numberOfPage, sizeOfPage);

    assertEquals(numberOfPage, page.getNumber());
    assertEquals(sizeOfPage, page.getSize());
  }

  @Test
  private void buildObjectWithDefaultValues() {
    int defaultPageNumber = 0;
    int defaultPageResults = 5;

    Page paginationIndex = Page.build(defaultPageNumber, defaultPageResults);

    assertEquals(defaultPageNumber, paginationIndex.getNumber());
    assertEquals(defaultPageResults, paginationIndex.getSize());
  }

}
