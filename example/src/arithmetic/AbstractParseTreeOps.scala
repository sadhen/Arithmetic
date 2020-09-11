package arithmetic

import org.antlr.v4.runtime.tree.ParseTree
import scala.reflect.ClassTag

trait AbstractParseTreeOps {

  def foreach[U](f: ParseTree => U): Unit = ???

  def map[That](f: ParseTree => That): Stream[That] = ???

  def filter(f: ParseTree => Boolean): Stream[ParseTree] = ???

  def exists(predicate: ParseTree => Boolean): Boolean = false

  def forall(predicate: ParseTree => Boolean): Boolean = false

  def count(predicate: ParseTree => Boolean): Int = 0

  def find(predicate: ParseTree => Boolean): Option[ParseTree] = None

  def collectFirst[T](partialFunction: PartialFunction[ParseTree, T]): Option[T] = ???

  def collectFirstAs[T](implicit classTag: ClassTag[T]): Option[T] = ???


  def isTerminalNode: Boolean = false

  def isRootNode: Boolean = false

  def isParenthesized: Boolean = false

  def isScientific: Boolean = false

  def containPlusOp: Boolean = false

  def containNoVariable: Boolean = false
}
