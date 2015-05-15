package models

case class Product(
  ean: Long, name: String, description: String)

object Product {

  var products = Set(
    Product (5010255079763L, "Zippers Large",
      "Large Plain Pack of 1000"),
    Product (501820624466L, "Giant Zipper",
      "Giant Plain 51mm 100 pack"),
    Product (5018306332812L, "No Tear Zipper Loop",
      "No Tear Extra Large Pack of 1000"),
    Product (5018206244611L, "Zebra Zippers",
      "Zebra Length 28mm Assorted 150 Pack")
  )

  def findAll = products.toList.sortBy(_.ean)
}