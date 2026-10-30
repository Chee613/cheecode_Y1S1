# WIA1007: Data Science - Advanced Calculation & Scenario Analysis

Difficulty: Master / Data Science
Topics: Linear Regression, Decision Trees, Statistics, Performance Metrics, Neural Networks, Data Transformation, and Machine Learning Fundamentals.

## Part 1: Core Fundamentals (Q1 – Q15)

**Q1. Linear Regression: The Salary Predictor**

Scenario: A tech firm uses Ordinary Least Squares (OLS) to predict the starting salary of Junior Developers based on their internship months. After analyzing their internal data, they determine the following parameters:
- Slope ($w_1$): 1,200
- Intercept ($w_0$): 30,000
- Mean Absolute Error (MAE): 2,500

**Question: If a candidate has 6 months of internship experience, what is their predicted salary, and what is the range of the prediction based on the MAE?**

- A. $37,200 (Range: $34,700 - $39,700)
- B. $36,000 (Range: $33,500 - $38,500)
- C. $31,200 (Range: $28,700 - $33,700)
- D. $38,400 (Range: $35,900 - $40,900)

**Q2. Decision Trees: Gini Impurity Split**

Scenario: You are building a Decision Tree to predict if a customer will renew a subscription. At a specific node, you have 20 customers:
- 12 Renewed (Yes)
- 8 Did Not Renew (No)

**Question: Calculate the Gini Impurity of this node before any further splitting occurs.**
(Formula: $Gini = 1 - \sum (p_i)^2$)

- A. 0.36
- B. 0.48
- C. 0.52
- D. 0.44

**Q3. Statistics: The Z-Score Anomaly**

Scenario: In a dataset of 5,000 employees, the monthly salary follows a normal distribution with a Mean ($\mu$) of $4,500 and a Standard Deviation ($\sigma$) of $800. You encounter a "Senior Consultant" record with a salary of $6,900.

**Question: Calculate the Z-score for this employee. Is this salary considered a statistical outlier if the threshold is $|Z| > 2.5$?**

- A. $Z = 3.0$; Yes, it is an outlier.
- B. $Z = 2.4$; No, it is not an outlier.
- C. $Z = 3.0$; No, it is not an outlier.
- D. $Z = 1.5$; No, it is not an outlier.

**Q4. Performance Metrics: RMSE Calculation**

Scenario: You have trained a regression model to predict housing prices (in $100,000s). For a small test batch of 3 houses, the results are:
- House A: Actual = 5, Predicted = 4
- House B: Actual = 3, Predicted = 3
- House C: Actual = 8, Predicted = 10

**Question: Calculate the Root Mean Squared Error (RMSE) for this batch.**

- A. 1.29
- B. 1.67
- C. 2.23
- D. 1.58

**Q5. Neural Networks: The Hidden Neuron**

Scenario: In a Multi-Layer Perceptron, a single neuron in the first hidden layer receives three inputs ($x$):
- $x_1 = 0.5, x_2 = 1.0, x_3 = 2.0$
- Corresponding weights: $w_1 = 0.2, w_2 = -0.5, w_3 = 0.8$
- Bias ($b$) = $-0.3$

**Question: Calculate the weighted sum ($z$) entering this neuron before the activation function is applied.**
(Formula: $z = \sum (w_i \cdot x_i) + b$)

- A. 0.8
- B. 1.0
- C. 0.9
- D. 1.2

6. Data Transformation: Min-Max Scaling

**Q6. Data Transformation: Min-Max Scaling**

Scenario: You are preparing a CGPA column for a Neural Network. The CGPA values range from a minimum of 2.0 to a maximum of 4.0. One student has a CGPA of 3.5.

**Question: Calculate the scaled value of this student's CGPA using Min-Max Normalization (scaling to a 0-1 range).**
(Formula: $x_{scaled} = \frac{x - min}{max - min}$)

- A. 0.75
- B. 0.80
**Q7. EDA: Interquartile Range (IQR) & Outliers**

Scenario: You have a sorted list of hours worked per week by 11 freelancers:
- [20, 25, 30, 32, 35, 40, 42, 45, 50, 55, 90]
- $Q1$ (25th percentile) = 30
- $Q3$ (75th percentile) = 50

**Question: Calculate the Upper Bound for identifying outliers using the $1.5 \times IQR$ rule. Based on this, is the value 90 an outlier?**

- A. Upper Bound = 80; Yes, 90 is an outlier.
- B. Upper Bound = 85; Yes, 90 is an outlier.
- C. Upper Bound = 70; Yes, 90 is an outlier.
- C. Upper Bound = 70; Yes, 90 is an outlier.
D. Upper Bound = 90; No, 90 is not an outlier.

**Q8. Linear Regression: Slope Calculation (OLS)**

Scenario: You have a tiny dataset of $(x, y)$ coordinates: $(1, 2), (2, 4), (3, 6)$.
- $\bar{x}$ (Mean of x) = 2
- $\bar{y}$ (Mean of y) = 4

**Question: Using the OLS formula for slope $m = \frac{\sum (x_i - \bar{x})(y_i - \bar{y})}{\sum (x_i - \bar{x})^2}$, calculate the slope ($m$).**

- A. 1.0
- B. 2.0
- C. 1.5
- D. 2.5

9. Decision Trees: Entropy and Information Gain

**Q9. Decision Trees: Entropy and Information Gain**

Scenario: A dataset has an initial Entropy of 0.97. After splitting the data on the "Education" feature, the weighted average entropy of the resulting child nodes is 0.55.

**Question: What is the Information Gain provided by the "Education" split?**

- A. 1.52
- B. 0.42
- C. 0.55
**Q10. Neural Networks: Output Layer Probabilities**

Scenario: A Softmax output layer for a 3-class classification problem (Apple, Orange, Banana) produces the following raw scores (logits):
- Apple: 2.0
- Orange: 1.0
- Banana: 0.0
- The sum of $e^{logits}$ is $7.39 + 2.72 + 1.0 = 11.11$.

**Question: What is the calculated probability that the input is an Apple?**
(Formula: $P(i) = \frac{e^{logit_i}}{\sum e^{logit_j}}$)

- A. 0.665 (66.5%)
- B. 0.245 (24.5%)
- C. 0.500 (50.0%)
- D. 0.090 (9.0%)

11. Linear Regression: Sum of Squared Errors (SSE)

Scenario: A researcher proposes a simple linear model $ŷ = 3x + 5$ to predict growth. They test the model on three observations: $(1, 10), (2, 11), (3, 16)$.
**Q11. Linear Regression: Sum of Squared Errors (SSE)**

Scenario: A researcher proposes a simple linear model $ŷ = 3x + 5$ to predict growth. They test the model on three observations: $(1, 10), (2, 11), (3, 16)$.

**Question: Calculate the Sum of Squared Errors (SSE) for this model on the given dataset.**

- A. 2.0
- B. 4.0
- C. 6.0
- D. 8.0
**Q12. Decision Trees: Weighted Gini Impurity**

Scenario: You are evaluating a split on a dataset of 10 samples. The split creates two child nodes:
- Node A (4 samples): 4 belong to Class 'Red', 0 to Class 'Blue'.
- Node B (6 samples): 1 belongs to Class 'Red', 5 to Class 'Blue'.

**Question: Calculate the Weighted Gini Impurity for this split.**

- A. 0.166
- B. 0.277
- C. 0.111
- 
13. Neural Networks: Multi-Layer Feed-forward

Scenario: A signal passes through a small Neural Network.
**Q13. Neural Networks: Multi-Layer Feed-forward**

Scenario: A signal passes through a small Neural Network.
- Input $x = 4$.
- Layer 1: A neuron with weight $w = 0.5$, bias $b = -1.0$, and a ReLU activation function.
- Layer 2 (Output): Receives the output of Layer 1. It has weight $w = 2.0$, bias $b = 0.5$, and a Linear activation function.

**Question: What is the final output of the network?**

- A. 1.0
- B. 2.5
- C. 0.5
- 
Scenario: A data scientist collects the following sample of 5 exam scores: [80, 85, 90, 95, 100]. The sample mean ($\bar{x}$) is 90.

Question: Calculate the Sample Variance ($s^2$) for this dataset.
**Q14. Statistics: Sample Variance Calculation**

Scenario: A data scientist collects the following sample of 5 exam scores: [80, 85, 90, 95, 100]. The sample mean ($\bar{x}$) is 90.

**Question: Calculate the Sample Variance ($s^2$) for this dataset.**
(Formula: $s^2 = \frac{\sum (x_i - \bar{x})^2}{n - 1}$)

- A. 50.0
- B. 62.5
- C. 75.0
- D. 12.5
**Q15. Performance Metrics: Outlier Sensitivity (MAE vs RMSE)**

Scenario: Two prediction models produce the following absolute errors for 4 instances:
- Errors: [2, 3, 2, 25]

**Question: Calculate the Mean Absolute Error (MAE) and the Root Mean Squared Error (RMSE). Which metric is more significantly affected by the single large error of 25?**

- A. MAE = 8.0, RMSE = 12.86; RMSE is more affected.
- B. MAE = 12.86, RMSE = 8.0; MAE is more affected.
- C. MAE = 8.0, RMSE = 25.0; RMSE is more affected.
- D. MAE = 3.0, RMSE = 5.5; MAE is more affected.

## Part 2: Intermediate Challenges (Q16 – Q30)
**Q16. Machine Learning: Gradient Descent Weight Update**

Scenario: You are training a regression model using Gradient Descent.
- Current weight ($w$) = 0.85
- Learning Rate ($\eta$) = 0.1
- Calculated Gradient (derivative of loss) = 0.4

**Question: Calculate the new weight ($w_{new}$) after one update step.**
(Formula: $w_{new} = w_{old} - \eta \cdot Gradient$)

- A. 0.81
- B. 0.89
- C. 0.45
- D. 0.75

17. Decision Trees: Multi-Class Gini Impurity

**Q17. Decision Trees: Multi-Class Gini Impurity**

Scenario: A dataset contains 10 items representing fruit colors: 5 are Red, 3 are Yellow, and 2 are Green.

**Question: Calculate the Gini Impurity for this distribution.**

- A. 0.62
- B. 0.38
- C. 0.50
**Q18. Data Transformation: Standardization (Z-Score Scaling)**

Scenario: A health dataset has a mean height of 170 cm and a standard deviation of 10 cm. You encounter a patient whose height is 195 cm.

**Question: Calculate the Standardized (Scaled) value of this height using Z-score scaling.**

- A. 1.5
- B. 2.5
- C. 3.0
- D. 2.0
**Q19. Statistics: F-Statistic in ANOVA**

Scenario: You run an ANOVA test to compare 3 different groups.
- Sum of Squares Between Groups ($SS_{Between}$) = 120
- Degrees of Freedom Between ($df_{Between}$) = 2
- Sum of Squares Within Groups ($SS_{Within}$) = 200
- Degrees of Freedom Within ($df_{Within}$) = 20

**Question: Calculate the F-statistic.**
(Formula: $F = \frac{SS_{Between} / df_{Between}}{SS_{Within} / df_{Within}}$)

- A. 0.6
- B. 1.2
- C. 6.0
- D. 12.0
D. 10.0

**Q20. Regression: Coefficient of Determination ($R^2$)**

Scenario: After fitting a regression model, you find that:
- Total Sum of Squares ($SST$) = 500
- Sum of Squared Errors ($SSE$) = 50

**Question: What is the R-Squared ($R^2$) value of this model?**
(Formula: $R^2 = 1 - \frac{SSE}{SST}$)

- A. 0.10
- B. 0.90
- C. 0.05
- D. 0.95

21. Classification Metrics: F1-Score from Confusion Matrix
**Q21. Classification Metrics: F1-Score from Confusion Matrix**

Scenario: A medical model is tested on 1,000 patients for a rare disease.
- True Positives (TP) = 8
- False Positives (FP) = 20
- False Negatives (FN) = 2
- True Negatives (TN) = 970

**Question: Calculate the F1-Score for this model.**
(Formula: $Precision = \frac{TP}{TP+FP}$, $Recall = \frac{TP}{TP+FN}$, $F1 = \frac{2 \times Precision \times Recall}{Precision + Recall}$)

- A. 0.421
- B. 0.285
- C. 0.800
- 
22. Decision Trees: Multi-Class Entropy

Scenario: A dataset node contains 10 samples: 4 belong to class A, 4 to class B, and 2 to class C.
(Note: $\log_2(0.4) \approx -1.32$, $\log_2(0.2) \approx -2.32$)

**Q22. Decision Trees: Multi-Class Entropy**

Scenario: A dataset node contains 10 samples: 4 belong to class A, 4 to class B, and 2 to class C.
(Note: $\log_2(0.4) \approx -1.32$, $\log_2(0.2) \approx -2.32$)

**Question: Calculate the Entropy of this node.**
(Formula: $Entropy = - \sum p_i \log_2(p_i)$)

- A. 1.00
- B. 1.52
- C. 2.32
- $ŷ = 10 + 2.5X_1 - 1.2X_2$

$X_1$ represents "Experience (Years)"
**Q23. Multiple Regression: Predicting Marginal Change**

Scenario: A multiple linear regression model is defined as:
$ŷ = 10 + 2.5X_1 - 1.2X_2$
- $X_1$ represents "Experience (Years)"
- $X_2$ represents "Commute Time (Hours)"

**Question: If an employee gains 2 years of experience but moves further away, increasing their commute by 5 hours, what is the total predicted change in their salary unit ($ŷ$)?**

- A. Increase of 5.0
- B. Decrease of 1.0
- C. Decrease of 6.0
- 
Question: What is the resulting output?
A. 0.0
**Q24. Neural Networks: Sigmoid Activation Flow**

Scenario: The output of a neuron's weighted sum is $z = 0$. You apply the Sigmoid activation function to determine the probability.
(Formula: $\sigma(z) = \frac{1}{1 + e^{-z}}$)

**Question: What is the resulting output?**

- A. 0.0
- B. 0.5
**Q25. Statistics: Standard Error of the Mean**

Scenario: You take a sample of 100 students from a university of 10,000. The standard deviation ($\sigma$) of the sample is found to be 15.

**Question: Calculate the Standard Error (SE) of the mean for this sample.**
(Formula: $SE = \frac{\sigma}{\sqrt{n}}$)

- A. 0.15
- B. 1.50
- C. 15.0
- Scenario: You want to scale the "Engine Power" of a car to a range of [0, 1].

**Q26. Preprocessing: Normalization to a Specific Range**

Scenario: You want to scale the "Engine Power" of a car to a range of [0, 1].
- Minimum engine power in dataset: 80 HP
- Maximum engine power in dataset: 280 HP
- Current car's power: 200 HP

**Question: What is the normalized value?**

- A. 0.60
- B. 0.71
- C. 0.50
- Scenario: In a simple regression analysis:

Total Sum of Squares ($SST$) = 1,200

Coefficient of Determination ($R^2$) = 0.75
**Q27. Regression: Sum of Squares Regression (SSR)**

Scenario: In a simple regression analysis:
- Total Sum of Squares ($SST$) = 1,200
- Coefficient of Determination ($R^2$) = 0.75

**Question: Calculate the Sum of Squares Regression (SSR), which represents the variance explained by the model.**
(Hint: $R^2 = \frac{SSR}{SST}$)

- A. 300
- B. 900
- C. 1,600
- 
Node 1 (Weight 0.5): Entropy = 0.8

**Q28. Decision Trees: Information Gain for 3-way Split**

Scenario:
- Root Entropy = 1.0
- After a 3-way split, the child nodes have:
  - Node 1 (Weight 0.5): Entropy = 0.8
  - Node 2 (Weight 0.3): Entropy = 0.0
  - Node 3 (Weight 0.2): Entropy = 1.0

**Question: Calculate the Information Gain (IG) for this split.**

- A. 0.4
- B. 0.6
- C. 0.2
- D. 0.8
**Q29. Clustering: Euclidean Distance in 3D Space**

Scenario: In a K-Means clustering algorithm, you calculate the distance between a data point $P(1, 2, 2)$ and a centroid $C(4, 6, 2)$.

**Question: Calculate the Euclidean Distance between them.**
(Formula: $d = \sqrt{(x_2-x_1)^2 + (y_2-y_1)^2 + (z_2-z_1)^2}$)

- A. 5.0
- B. 7.0
- C. 25.0
- 
**Q30. Machine Learning: Learning Rate Impact**

Scenario: You are using Gradient Descent.
- Current weight ($w$) = 10.0
- Gradient ($\frac{\partial L}{\partial w}$) = 5.0
- Learning rate ($\eta$) = 0.5

**Question: Calculate the new weight after two iterations, assuming the gradient stays constant at 5.0 for both steps.**

- A. 7.5
- B. 5.0
- C. 2.5
- D. 0.0

## Answer Key & Explanations

**Q1.** $y = (1200 \times 6) + 30000 = 7200 + 30000 = 37200$. Range is $37200 \pm 2500$. **Answer: A**

**Q2.** $1 - [(12/20)^2 + (8/20)^2] = 1 - [0.36 + 0.16] = 1 - 0.52 = 0.48$. **Answer: B**

**Q3.** $Z = (6900 - 4500) / 800 = 2400 / 800 = 3.0$. Since $3.0 > 2.5$, it is an outlier. **Answer: A**

**Q4.** Squared errors: $(5-4)^2=1, (3-3)^2=0, (8-10)^2=4$. Mean Squared Error = $(1+0+4)/3 = 1.66$. $\sqrt{1.66} \approx 1.29$. **Answer: A**

**Q5.** $z = (0.5 \times 0.2) + (1.0 \times -0.5) + (2.0 \times 0.8) - 0.3 = 0.1 - 0.5 + 1.6 - 0.3 = 0.9$. **Answer: C**

**Q6.** $(3.5 - 2.0) / (4.0 - 2.0) = 1.5 / 2.0 = 0.75$. **Answer: A**

**Q7.** $IQR = 50 - 30 = 20$. Upper Bound = $50 + (1.5 \times 20) = 50 + 30 = 80$. Since $90 > 80$, it is an outlier. **Answer: A**

**Q8.** Numerator: $(1-2)(2-4) + (2-2)(4-4) + (3-2)(6-4) = (-1)(-2) + 0 + (1)(2) = 2 + 2 = 4$. Denominator: $(1-2)^2 + (2-2)^2 + (3-2)^2 = 1 + 0 + 1 = 2$. $m = 4/2 = 2$. **Answer: B**

**Q9.** $IG = 0.97 - 0.55 = 0.42$. **Answer: B**

**Q10.** $e^{2.0} / 11.11 = 7.39 / 11.11 \approx 0.665$. **Answer: A**

**Q11.** $SSE = 2^2 + 0^2 + 2^2 = 4 + 0 + 4 = 8$. **Answer: D**

**Q12.** $Gini_A = 0$ (pure). $Gini_B = 1 - [(1/6)^2 + (5/6)^2] = 0.278$. Weighted: $(4/10 \times 0) + (6/10 \times 0.278) \approx 0.166$. **Answer: A**

**Q13.** $L1: (4 \times 0.5) - 1.0 = 1.0$. $ReLU(1.0) = 1.0$. $L2: (1.0 \times 2.0) + 0.5 = 2.5$. **Answer: B**

**Q14.** Sum sq diffs: 250. $Var = 250 / (5-1) = 62.5$. **Answer: B**

**Q15.** $MAE = 8.0$. $RMSE = \sqrt{160.5} \approx 12.86$. RMSE is more affected. **Answer: A**

**Q16.** $w_{new} = 0.85 - (0.1 \times 0.4) = 0.81$. **Answer: A**

**Q17.** $1 - [0.25 + 0.09 + 0.04] = 0.62$. **Answer: A**

**Q18.** $Z = (195 - 170) / 10 = 2.5$. **Answer: B**

**Q19.** $MS_{B} = 60, MS_{W} = 10, F = 6.0$. **Answer: C**

**Q20.** $1 - (50 / 500) = 0.9$. **Answer: B**

**Q21.** Precision = $8/28 = 0.285$. Recall = $8/10 = 0.8$. $F1 = (2 \times 0.285 \times 0.8) / (0.285 + 0.8) \approx 0.421$. **Answer: A**

**Q22.** $-(0.4 \times -1.32 + 0.4 \times -1.32 + 0.2 \times -2.32) = -(-0.528 - 0.528 - 0.464) = 1.52$. **Answer: B**

**Q23.** Change = $(2.5 \times 2) + (-1.2 \times 5) = 5.0 - 6.0 = -1.0$. **Answer: B**

**Q24.** $1 / (1 + e^0) = 1 / (1 + 1) = 0.5$. **Answer: B**

**Q25.** $15 / \sqrt{100} = 15 / 10 = 1.5$. **Answer: B**

**Q26.** $(200 - 80) / (280 - 80) = 120 / 200 = 0.6$. **Answer: A**

**Q27.** $SSR = R^2 \times SST = 0.75 \times 1200 = 900$. **Answer: B**

**Q28.** Weighted Entropy = $(0.5 \times 0.8) + (0.3 \times 0.0) + (0.2 \times 1.0) = 0.4 + 0 + 0.2 = 0.6$. $IG = 1.0 - 0.6 = 0.4$. **Answer: A**

**Q29.** $\sqrt{(4-1)^2 + (6-2)^2 + (2-2)^2} = \sqrt{3^2 + 4^2 + 0^2} = \sqrt{9 + 16} = 5$. **Answer: A**

**Q30.** Step 1: $10 - (0.5 \times 5) = 7.5$. Step 2: $7.5 - (0.5 \times 5) = 5.0$. **Answer: B**