package com.rxmobileteam.lecture11

import com.rxmobileteam.utils.ExerciseNotCompletedException
import io.reactivex.rxjava3.core.Observable

object Riddle1 {
  /**
   * Transform the given [value] into an Observable that emits the value and then completes.
   *
   * Use case: You want to transform some value to the reactive world.
   */
  fun solve(value: Int): Observable<Int> {
    // TODO: implement this method
    return Observable.just(value)
  }
}

fun main() {
  Riddle1.solve(5)
    .test()
    .assertResult(5)

  Riddle1.solve(5)
    .materialize()
    .subscribe(::println)

  println("NICE WORK!")
}
