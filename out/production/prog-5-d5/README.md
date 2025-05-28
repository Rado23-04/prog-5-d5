# prog-5-d5


# Coffee Machine Simulation

This project is a simple coffee machine simulation using a clean and modular software architecture.

## Main Functionality

The system allows a user to:

- Make a payment (`pay`)
- Choose a coffee (`choix café`) from options `c1`, `c2`, or `c3`
- Receive the selected coffee (`get coffee`)

---

## Project Architecture

The project follows **Clean Architecture** principles and is structured into the following modules:

### 🔹 getcoffee/

Contains the logic for delivering the coffee to the user after payment and coffee selection.

### 🔹 business/

Handles core business rules such as:
- Validating payment
- Checking the selected coffee (`c1`, `c2`, `c3`)
- Ensuring stock availability

### 🔹 usecases/

Defines the main application use cases:
- Initiating payment
- Selecting a coffee
- Dispensing the selected coffee

### 🔹 errors/

Handles all possible system errors like:
- Insufficient payment
- Invalid coffee selection
- Out-of-stock items

### 🔹 modelisation/

Contains the data models used throughout the app (e.g., `Coffee`, `Payment`, `Order`, etc.)

---

## How It Works

1. The user makes a **payment**
2. The user chooses a coffee: `c1`, `c2`, or `c3`
3. The user retrieves the coffee using `get coffee`

---

## Upcoming Features

- User interface (CLI or Web)
- Order history tracking
- Advanced stock management

---

## Author

This project was created as part of a student learning exercise to understand code structure and clean software architecture.
