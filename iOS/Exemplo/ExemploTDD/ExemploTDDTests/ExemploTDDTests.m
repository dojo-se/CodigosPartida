//
//  ExemploTDDTests.m
//  ExemploTDDTests
//
//  Created by Hugo Doria on 8/7/14.
//  Copyright (c) 2014 DOJO-SE. All rights reserved.
//

#import <XCTest/XCTest.h>
#import "DOJViewController.h"

@interface ExemploTDDTests : XCTestCase

@property (nonatomic, strong) DOJViewController *principalVC;

@end

@implementation ExemploTDDTests

/** Possibiliaddes
 * XCTFail (format…)
 * XCTAssertNil (a1, format…)
 * XCTAssertNotNil (a1, format…)
 * XCTAssert (a1, format…)
 * XCTAssertTrue (a1, format…)
 * XCTAssertFalse (a1, format…)
 * XCTAssertEqualObjects (a1, a2, format…)
 * XCTAssertEquals (a1, a2, format…)
 * XCTAssertEqualsWithAccuracy (a1, a2, accuracy, format…)
 * XCTAssertThrows (expression, format…)
 * XCTAssertThrowsSpecific (expression, specificException, format…)
 * XCTAssertThrowsSpecificNamed (expression, specificException, exceptionName, format…)
 * XCTAssertNoThrow (expression, format…)
 * XCTAssertNoThrowSpecific (expression, specificException, format…)
 * XCTAssertNoThrowSpecificNamed (expression, specificExcepton, exceptionName, format…)
 **/

- (void)setUp
{
    [super setUp];
    // Put setup code here. This method is called before the invocation of each test method in the class.

    UIStoryboard *storyboard = [UIStoryboard storyboardWithName:@"Main" bundle:nil];
    self.principalVC = [storyboard instantiateViewControllerWithIdentifier:@"telaPrincipal"];
    [self.principalVC performSelectorOnMainThread:@selector(loadView) withObject:nil waitUntilDone:YES];

}

- (void)tearDown
{
    // Put teardown code here. This method is called after the invocation of each test method in the class.
    self.principalVC = nil;
    [super tearDown];
}

#pragma mark - Testes

- (void)testaSeExisteViewNoViewController
{
    XCTAssert(self.principalVC.view, @"A view não foi iniciada corretamente");
}

- (void)testaAQuantidadeDeSubviewsNaTela
{
    int quantidadeEsperada = 5;
    NSArray *subviews = self.principalVC.view.subviews;
    NSLog(@"SUBVIEWS: %@", subviews);
    XCTAssert(subviews.count == quantidadeEsperada, @"Esperava %i subviews, mas achei %lu", quantidadeEsperada,
              (unsigned long)subviews.count);
}

- (void)testaSeExisteUmTextViewNaTela
{
    NSArray *subviews = self.principalVC.view.subviews;
    XCTAssertTrue([subviews containsObject:self.principalVC.textView], @"View does not have a table subview");
}

- (void)testaSeExisteUmBotaoDeAcaoNaTela
{
    NSArray *subviews = self.principalVC.view.subviews;
    XCTAssertTrue([subviews containsObject:self.principalVC.botaoDeAcao], @"View does not have a table subview");
}

- (void)testaSeExisteUmCampoDeTextoNaTela
{
    NSArray *subviews = self.principalVC.view.subviews;
    XCTAssertTrue([subviews containsObject:self.principalVC.campoDeTexto], @"View does not have a table subview");
}

@end
