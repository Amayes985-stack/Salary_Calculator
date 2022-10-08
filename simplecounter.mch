MACHINE SimpleCounter
DEFINITIONS MAX==4
VARIABLES count
INVARIANT
 count: 1..MAX
INITIALISATION count := 1
OPERATIONS
  Increase(y) = PRE y: 1..(MAX-count) THEN
     count := count+y
  END;