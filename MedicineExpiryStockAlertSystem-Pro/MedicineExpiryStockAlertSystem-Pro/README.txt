MEDTRACK — MEDICINE EXPIRY & STOCK ALERT SYSTEM
================================================
Java Swing + OOP + file handling. No database required.

FEATURES
- Modern dashboard with inventory summary cards
- Add, edit, delete medicine records
- Search by ID, name, company, or batch number
- Filter all/in-stock/low-stock/expiring-soon/expired
- Expiry and stock alerts
- Double-click a table row to edit
- Export inventory to CSV
- Auto-save to data/medicines.dat
- Input validation and duplicate ID prevention
- Reload saved records

RUN IN VS CODE
1. Extract the ZIP.
2. Open the extracted project folder in VS Code.
3. Open Terminal in that folder and run:
   javac -encoding UTF-8 -d out src/*.java
   java -cp out Main

Expiry date format: DD/MM/YYYY (example: 20/12/2027)
Run commands from the project root so the data folder is used correctly.
