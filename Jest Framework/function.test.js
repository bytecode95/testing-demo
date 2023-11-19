const functions =  require('./function');
//Jest uses "matchers" to let you test values in different ways.
//toBe
//test suites
test('Add 2+2 equals to 4', () => { 
    expect(functions.add(2,2)).toBe(4); 
});

test('Add 2+2 not equal to 5',()=>{
    expect(functions.add(2,2)).not.toBe(5);
});


//check null
test('Should be null',()=>{
    expect(functions.isNull()).toBeNull();
})

//Truthiness
test('null', () => {
    const n = null;
    expect(n).toBeNull();
    expect(n).toBeDefined();
    expect(n).not.toBeUndefined();
    expect(n).not.toBeTruthy();
    expect(n).toBeFalsy();
});

  test('zero', () => {
    const z = 0;
    expect(z).not.toBeNull();
    expect(z).toBeDefined();
    expect(z).not.toBeUndefined();
    expect(z).not.toBeTruthy();
    expect(z).toBeFalsy();
  });

  //Numbers
  test('two plus two',()=>{
    const value = 2+2;
    
    expect(value).toBeGreaterThan(3);
    expect(value).toBeGreaterThanOrEqual(3.5);
    expect(value).toBeLessThan(5);
    expect(value).toBeLessThanOrEqual(4.5);

    // toBe and toEqual are equivalent for numbers
    expect(value).toBe(4);
    expect(value).toEqual(4);
  })

  //floating point numbers

  test('adding floating point numbers',()=>{
    const value = 0.1+0.2;
    //expect(value).toBe(0.3);  his won't work because of rounding error
    expect(value).toBeCloseTo(0.3);
  })

  //Expected: 0.3
  //Received: 0.30000000000000004

