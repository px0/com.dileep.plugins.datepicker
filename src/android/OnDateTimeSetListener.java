package com.dileep.plugins.datepicker;

public interface OnDateTimeSetListener {
	
	public void onDateTimeSet(final DateTimePickerDialog dateTimePickerDialog,
			final int year, final int monthOfYear, final int dayOfMonth,
			final int hourOfDay, final int minute);

}
