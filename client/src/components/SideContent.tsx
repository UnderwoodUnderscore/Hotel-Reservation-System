import OtherOptions from './OtherOptions';

export default function SideContent({ side, display, handleBooking }) {

    return (
        <>
            <section className={"sideContent " + side +  ' ' + display}>
                <h2 className="sideContent header">Form</h2>
                <span className="exit-icon" onClick={handleBooking}></span>

                <p>Book Today!</p>
                <img className="sideContent image" src="../public/images/confident professional woman pointing perfect.png" alt="confident professional woman pointing to upper-left"></img>

                <div className="sideContent secondary">
                    <form id="bookingForm">
                        <label htmlFor="booking-start-date">Start Date</label>
                        <input id="booking-start-date" type="text" placeholder="Enter initial date"></input>

                        <label htmlFor="booking-end-date">End Date</label>
                        <input id="booking-end-date" type="text" placeholder="Enter end date"></input>

                        <label htmlFor="booking-message">Message</label>
                        <textarea id="booking-message" placeholder="Type your message"></textarea>

                        <button type="submit">Send</button>
                    </form>
                    
                    <h2 className="sideContent header">More Options</h2>
                    <OtherOptions name="Visit Faq" desc={["Find answers to commonly asked questions."]} />
                    <OtherOptions name="Call us" desc={["Monday to Friday 9:00am to 5:00pm", "1-800-987-6543"]} />
                </div>
            </section>
        </>
    )
}