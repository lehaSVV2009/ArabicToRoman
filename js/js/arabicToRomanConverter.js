/**
 *
 * Can be used for converting arabic numbers to roman figures
 * by the method "arabicToRoman"
 *
 * @author Kadet
 */


/**
 *  Arrays of arabic numbers and roman figures.
 *  Order is important
 */
var ARABIC = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1],
    ROMAN = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'];


/**
 *  Error constants
 */
var INPUT_ERROR_MESSAGE = "InputError";
var INPUT_ANY_NUMBER = "Input any number from 1 to 3999!";
var WRONG_TYPE_ERROR_MESSAGE = 'Wrong Type Error';
var REQUIRED_TYPE_MESSAGE = 'is not a valid input';
var WRONG_NUMBER_ERROR_MESSAGE = 'Wrong Number Error';
var REQUIRED_VALUES_MESSAGE = 'Input must be in the range of 1 to 3999!';


/**
 *  Convert arabic number to roman figures
 *
 * @param arabic    String or Integer number between 1 and 3999
 * @return string   roman figures
 */
function arabicToRoman(arabic) {

    validateArabic(arabic);
    var roman = '';

    for (var arabicIndex = 0; arabicIndex < ARABIC.length; ++arabicIndex) {
        var arabicKey = ARABIC[arabicIndex];
        while (arabic >= arabicKey) {
            roman += ROMAN[arabicIndex];
            arabic -= arabicKey;
        }
    }

    return roman;
}


/**
 *  Throws Error if arabic is null, is not a Number, is not in the range of 1 to 3999
 *
 * @param arabic    Integer value
 */
function validateArabic(arabic) {
    if (!arabic || arabic == '') {
        throw createError(INPUT_ERROR_MESSAGE, INPUT_ANY_NUMBER);
    }
    if (isNaN(arabic) || (parseInt(arabic, 10) != arabic)) {
        throw createError(INPUT_ERROR_MESSAGE, WRONG_TYPE_ERROR_MESSAGE + ": " + typeof arabic + '. ' + REQUIRED_TYPE_MESSAGE);
    }
    if (arabic < 1 || arabic > 3999) {
        throw createError(INPUT_ERROR_MESSAGE, WRONG_NUMBER_ERROR_MESSAGE + ": " + arabic + '. ' + REQUIRED_VALUES_MESSAGE);
    }
}


/**
 *  Simple creation of error object
 */
function createError(name, message) {
    var error = new Error();
    error.name = name;
    error.message = message;
    return error;
}