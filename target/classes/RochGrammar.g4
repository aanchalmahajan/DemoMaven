grammar RochGrammar;

grammarstart: 'start' block 'terminate';
block: (statement)+;
statement: variableDeclaration|assignment|display|checkCondition|untilLoop;
assignment: identifier '=' (identifier|arithmeticExp|conditionalExp);
arithmeticExp: arithmeticExp '*' arithmeticExp|arithmeticExp '/' arithmeticExp|arithmeticExp '+' arithmeticExp|arithmeticExp '-' arithmeticExp|identifier|Integer;
conditionalExp: conditionalExp '>=' conditionalExp|conditionalExp '<=' conditionalExp|conditionalExp '>' conditionalExp|conditionalExp '<' conditionalExp|identifier|Bool;
dataType: ('num'|'bool');
checkCondition: check otherwise? checkEnd;
check: 'check' conditionalExp block;
otherwise: 'otherwise' block;
checkEnd: 'checkEnd';
untilLoop: until untilEnd;
until : 'until' conditionalExp block;
untilEnd : 'untilEnd';
variableDeclaration : dataType identifier;
identifier: Character (Character|Integer)* ;
Character: [a-zA-Z_];
Integer: [1-9] Digit*|'0';
Digit: [0-9];
Bool: 'true'|'false';
display: 'display(' (arithmeticExp|conditionalExp) ')';
BlankWhiteSpace :  [ \r\t\n\u000C] -> skip;

Comment: ('!!' ~[\r\n]* | '!--' .*? '--!') -> skip;