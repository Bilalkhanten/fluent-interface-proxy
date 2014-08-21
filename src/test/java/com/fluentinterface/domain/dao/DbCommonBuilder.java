package com.fluentinterface.domain.dao;

import java.util.Calendar;

public interface DbCommonBuilder<T extends DbCommonBuilder<T>> {
	T withId(final String id);

	T withVersion(final int version);

	T withDescription(final String description);

	T withCreated(final Calendar created);

	T withCreatedBy(final String createdBy);

	T withUpdated(final Calendar updated);

	T withUpdatedBy(final String updatedBy);
}
