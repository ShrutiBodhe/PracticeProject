/**
 * Shruti.Bodhe
 * 2019-11-29
 */
package com.incture.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("PracticeServiceFacade")
public class PracticeServiceFacade {

	private final Logger MYLOGGER = LoggerFactory.getLogger(this.getClass());

}
