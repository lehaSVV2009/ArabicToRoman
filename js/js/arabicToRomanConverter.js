/**
 *  Error constants
 */
var WRONG_TYPE_ERROR_MESSAGE = 'Wrong Type Error!';
var REQUIRED_TYPE_MESSAGE = 'is not a valid input';
var WRONG_NUMBER_ERROR_MESSAGE = 'Wrong Number Error!';
var REQUIRED_VALUES_MESSAGE = 'Input must be in the range of 1 to 3999!';


/**
 *  Convert arabic number to roman figures
 *
 * @param arabic    Integer number between 1 and 3999
 * @return {number}
 */
function arabicToRoman (arabic) {

    validateArabic(arabic);

    var roman = 123;

    return roman;
}

/**
 *  Validate arabic number on correctness. If it is wrong, function throws error
 *
 * @param arabic    Integer value
 */
function validateArabic (arabic) {
    if (!arabic instanceof int) {
        throw new Error(WRONG_TYPE_ERROR_MESSAGE + ": " + typeof arabic + '. ' + REQUIRED_TYPE_MESSAGE);
    }
    if (arabic > 1 && arabic < 3999) {
        throw new Error(WRONG_NUMBER_ERROR_MESSAGE + ": " + arabic + '. ' + REQUIRED_VALUES_MESSAGE);
    }
}