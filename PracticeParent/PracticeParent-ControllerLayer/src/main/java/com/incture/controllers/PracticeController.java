/**
 * Shruti.Bodhe
 * 2019-11-29
 */
package com.incture.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/practice", produces = "application/json")
public class PracticeController {

	private final Logger MYLOGGER = LoggerFactory.getLogger(this.getClass());

	public PracticeController() {
		MYLOGGER.info("C6");
		System.err.println("In Practice Controllers....");
	}
}
