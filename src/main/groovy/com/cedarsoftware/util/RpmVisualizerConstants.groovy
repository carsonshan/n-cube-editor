package com.cedarsoftware.util

import groovy.transform.CompileStatic

/**
 * Provides constants for the visualizer
 */

@CompileStatic
final class RpmVisualizerConstants extends VisualizerConstants
{
	public static final String RPM_CLASS = 'rpm.class'
	public static final String RPM_ENUM = 'rpm.enum'
	public static final String RPM_CLASS_DOT = 'rpm.class.'
	public static final String RPM_SCOPE_CLASS_DOT = 'rpm.scope.class.'
	public static final String RPM_ENUM_DOT = 'rpm.enum.'
	public static final String CLASS_TRAITS = 'CLASS_TRAITS'
	public static final String DOT_CLASS_TRAITS = '.classTraits'
	public static final String DOT_TRAITS = '.traits'
	public static final String R_RPM_TYPE = 'r:rpmType'
	public static final String R_EXISTS = 'r:exists'
	public static final String V_ENUM = 'v:enum'
	public static final String R_SCOPED_NAME = 'r:scopedName'
	public static final String V_MIN = 'v:min'
	public static final String V_MAX = 'v:max'
	public static final String SOURCE_FIELD_NAME = 'sourceFieldName'
	public static final String AXIS_FIELD = 'field'
	public static final String AXIS_NAME = 'name'
	public static final String AXIS_TRAIT = 'trait'
	public static final String V_MIN_CARDINALITY = '0'
	public static final String V_MAX_CARDINALITY = '999999'

	public static final String EFFECTIVE_VERSION = '_effectiveVersion'
	public static final String POLICY_CONTROL_DATE = 'policyControlDate'
	public static final String QUOTE_DATE = 'quoteDate'
	public static final String BUSINESS_DIVISION_CODE = 'businessDivisionCode'
	public static final String STATE = 'state'
	public static final String LOCATION_STATE = 'locationState'
	public static final String SOURCE_SCOPE_KEY_PREFIX = 'source'
	public static final String SYSTEM_SCOPE_KEY_PREFIX = "_"
	public static final String EFFECTIVE_VERSION_SCOPE_KEY = SYSTEM_SCOPE_KEY_PREFIX + "effectiveVersion"
	public static final String ENT_APP = 'ENT.APP'
	public static final String BUSINESS_DIVISION_CUBE_NAME = 'ent.manual.BusinessDivision'
	public static final String STATE_CUBE_NAME = 'ent.manual.State'
	public static final Set<String> MANDATORY_SCOPE_KEYS = [AXIS_FIELD, AXIS_NAME, AXIS_TRAIT] as Set

	public static final String CUBE_TYPE_RPM = 'rpm'

	public static final String TYPES_TO_ADD_CUBE_NAME = 'VisualizerTypesToAdd'
	public static final String SOURCE_TYPE = 'sourceType'
	public static final String TARGET_TYPE = 'targetType'

	public static final String UNSPECIFIED_ENUM = 'UNSPECIFIED_ENUM'

	public static final String LOAD_CELL_VALUES_LABEL = 'traits'

	public static final String DETAILS_LABEL_UTILIZED_SCOPE = 'Utilized scope'
	public static final String DETAILS_LABEL_UTILIZED_SCOPE_WITHOUT_ALL_TRAITS = 'Utilized scope to load class without all traits'
	public static final String DETAILS_LABEL_FIELDS = 'Fields'
	public static final String DETAILS_LABEL_FIELDS_AND_TRAITS = 'Fields and traits'
	public static final String DETAILS_LABEL_CLASS_TRAITS = 'Class traits'

	public static final String CUBE_IS_NOT_RPM_ENUM = 'Cube is not an rpm.enum cube: '
	public static final String DEFAULT_VALUE_MAY_BE_CHANGED = 'Its default value may be changed as desired.'
	public static final String OTHER_DEFAULT_VALUE_MAY_BE_CHANGED = 'The other default scope values may also be changed as desired.'


}