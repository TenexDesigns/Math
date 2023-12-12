Trigonometry is not limited to right triangles. It can also be applied to other types of polygons using the Law of Sines and the Law of Cosines.


Trigonometry is not limited to triangles. While trigonometric functions are most commonly defined and used in the context of right triangles, they can also be applied to other types of polygons.

The trigonometric functions sine (sin), cosine (cos), and tangent (tan) are all defined based on the angles of a right triangle. However, these functions can be extended to any angle, not just those in a right triangle. This is done using the unit circle, which is a circle of radius 1 centered at the origin of a coordinate system. The unit circle is used to define the values of the trigonometric functions for all angles [Source 4](https://www.khanacademy.org/math/trigonometry).

In the context of a unit circle, the sine of an angle is the y-coordinate of the point on the circle where the angle intersects the circle, the cosine is the x-coordinate, and the tangent is the ratio of the y-coordinate to the x-coordinate. These definitions apply to all angles, not just those in a right triangle.

For non-right triangles, the Law of Sines and the Law of Cosines are used to solve for missing sides or angles. The Law of Sines states that the ratio of the length of a side of a triangle to the sine of the angle opposite that side is the same for all three sides. The Law of Cosines states that the square of the length of a side of a triangle is equal to the sum of the squares of the lengths of the other two sides minus twice the product of those two sides and the cosine of the angle between them [Source 4](https://www.khanacademy.org/math/trigonometry).

In programming and game development, trigonometric functions are used in a variety of ways. For example, they can be used to calculate the trajectory of projectiles, rotate objects, create smooth transitions between values, and draw circular objects. The sine and cosine functions are particularly useful for moving an object in any given direction [Source 3](https://stackoverflow.com/questions/3946892/trigonometry-and-game-development).

Here is an example of how you might use sine and cosine in a game development context:

```javascript
// Example code, will move the object speed units in the given direction (degrees)
d2r = pi / 180; // Conversion from degrees to radians
this.x += speed * cos(direction * d2r);
this.y += speed *-sin(direction * d2r);
```

In this example, the object's new position is calculated by adding the product of the object's speed and the cosine of the direction to the object's current x-coordinate, and subtracting the product of the object's speed and the sine of the direction from the object's current y-coordinate. This moves the object in the direction specified by the angle [Source 3](https://stackoverflow.com/questions/3946892/trigonometry-and-game-development).



...
