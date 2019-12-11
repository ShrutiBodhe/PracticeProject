package com.incture.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaginationHelperDto {

	private Integer startIndex;

	private Integer batchSize;

}
